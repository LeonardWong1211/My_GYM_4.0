package cn.edu.bjtu.mysport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class Contact_CursorAdapter extends CursorAdapter {
    public Contact_CursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {

        return LayoutInflater.from(context).inflate(
                R.layout.activity_contact__cursor_adapter,viewGroup,false );
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String contactName = cursor.getString(
                cursor.getColumnIndex(Contact_DBOpenHelper.CONTACT_NAME));
        String contactPhone = cursor.getString(
                cursor.getColumnIndex(Contact_DBOpenHelper.CONTACT_PHONE));
        TextView nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        TextView phoneTextView = (TextView) view.findViewById(R.id.phoneTextView);
        nameTextView.setText(contactName);
        phoneTextView.setText(contactPhone);

    }
}
