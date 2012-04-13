package $package$.tests

import $package$._
import junit.framework.Assert._
import _root_.android.test.AndroidTestCase
import _root_.android.test.ActivityInstrumentationTestCase2

class AndroidTests extends AndroidTestCase {
  def testPackageIsCorrect() {
    assertEquals("$package$", getContext.getPackageName)
  }
}

class ActivityTests(activityClass: Class[$main_activity$]) extends ActivityInstrumentationTestCase2[$main_activity$](activityClass) {
   def testHelloWorldIsShown() {
      val activity = getActivity
      val textview = activity.findView(TR.textview)
      assertEquals(textview.getText, "hello, world!")
    }
}
