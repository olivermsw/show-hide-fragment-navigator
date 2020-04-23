# [show-hide-fragment-navigator](https://github.com/olivermsw/show-hide-fragment-navigator)

Navigation 使用 `FragmenManager.replace()` 来切换 fragment 导致上一个 fragment 会销毁,`ShowHideFragmentNavigator`基本和官方`FragmentNavigator`类似，但是使用了`FragmenManager.add()`和`FragmenManager.hide()`来切换fragment,并提供了设置默认fragment装换动画方法。

#### 使用方法



```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```

```groovy
implementation 'com.github.olivermsw:show-hide-fragment-navigator:1.0.0'
```

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)!!
        //设置ShowHideFragmentNavigator
        navController.navigatorProvider.addNavigator(
            ShowHideFragmentNavigator(
                this,
                navHostFragment.childFragmentManager,
                R.id.nav_host_fragment,
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        )
        navController.setGraph(R.navigation.nav) //必须使用代码显示设置
    }
```

```xml
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/nav"
    app:startDestination="@id/blank1Fragment"
    tools:ignore="UnusedNavigation">
    <!-- 必须使用show_hide_fragment标签 -->
    <show_hide_fragment
        android:id="@+id/blank1Fragment"
        android:name="com.olimsw.showhidefragmentnavigator.Blank1Fragment"
        android:label="fragment_blank1"
        tools:layout="@layout/fragment_blank1">
        <action
            android:id="@+id/action_blank1Fragment_to_blank2Fragment"
            app:destination="@id/blank2Fragment" />
        <!-- 支持自定义动画，设置@anim/no为无动画 -->
        <action
            android:id="@+id/action_blank1Fragment_to_blank2Fragment_diy_anim"
            app:destination="@id/blank2Fragment"
            app:enterAnim="@anim/fade_in"
            app:exitAnim="@anim/fade_out"
            app:popEnterAnim="@anim/fade_in"
            app:popExitAnim="@anim/fade_out" />
    </show_hide_fragment>
    <show_hide_fragment
        android:id="@+id/blank2Fragment"
        android:name="com.olimsw.showhidefragmentnavigator.Blank2Fragment"
        android:label="fragment_blank2"
        tools:layout="@layout/fragment_blank2" />
</navigation>
```


