package su.harbour.hdcalcul;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import su.harbour.hDroidGUI.Harbour;

public class MainActivity extends Activity {

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      MainApp.harb.setDopClass( DopActivity.class );
      setContentView( MainApp.harb.createAct( this ) );
   }

   @Override
   protected void onResume() {
       super.onResume();

      MainApp.harb.setContext( this );
   }

   @Override
   protected void onDestroy() {
       super.onDestroy();

       MainApp.harb.closeAct();
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
