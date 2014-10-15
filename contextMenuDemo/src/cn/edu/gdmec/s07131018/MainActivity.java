package cn.edu.gdmec.s07131018;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText et;
	private TextView tv;
	final int MENU_ITEM1 = Menu.FIRST;
	final int MENU_ITEM2 = Menu.FIRST+1;
	final int MENU_ITEM3 = Menu.FIRST+2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);
        registerForContextMenu(tv);
    }


    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderTitle("快捷菜单");
		menu.add(0,MENU_ITEM1,0,"菜单项1");
		menu.add(0,MENU_ITEM2,1,"菜单项2");
		menu.add(0,MENU_ITEM3,2,"菜单项3");
	}





	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		tv.setText("你点击了"+item.getTitle()+"菜单项");
		et.setText("你点击了"+item.getTitle()+"菜单项");
		return super.onContextItemSelected(item);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
