package su.harbour.hdcalcul;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import su.harbour.hDroidGUI.*;

public class MainActivity extends Activity {

   private static View mainView;

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      //MainApp.harb.hlog("Main - onCreate");
      MainApp.harb.setDopClass( DopActivity.class );
      mainView = MainApp.harb.createAct( this, null );
      setContentView( mainView );
      MainApp.harb.hrbCall( "HD_INITWINDOW","0" );
   }

   @Override
   protected void onResume() {
       super.onResume();

      //MainApp.harb.hlog("Main - onResume");
      MainApp.harb.setContext( this, mainView );
   }

   @Override
   protected void onDestroy() {
       super.onDestroy();

       //MainApp.harb.hlog("Main - onDestroy");
       MainApp.harb.closeAct( "0" );
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MainApp.harb.SetMenu( menu );
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       MainApp.harb.onMenuSel( item.getItemId() );
       return true;
    }

}
