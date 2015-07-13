<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0FFF0">
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="30sp"
    android:layout_gravity="center_vertical"
    android:text="@string/TiZhong"
    android:id="@+id/tiZhong"

    android:layout_marginTop="144dp"
    android:layout_alignParentTop="true"
    android:layout_toLeftOf="@+id/TiZhong"
    android:layout_toStartOf="@+id/TiZhong" />
    <EditText
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="30sp"
    android:hint="@string/qingshurutizhong"

        android:layout_alignBottom="@+id/tiZhong"
        android:layout_centerHorizontal="true"
        android:id="@+id/TiZhong" />
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/shengao"
        android:layout_below="@+id/tiZhong"
        android:layout_toLeftOf="@+id/TiZhong"
        android:layout_toStartOf="@+id/TiZhong"
        android:textSize="30sp"

        android:id="@+id/button2" />
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:hint="@string/qingshurushengao"
        android:layout_alignBottom="@+id/button2"
        android:layout_toRightOf="@+id/button2"
        android:layout_toEndOf="@+id/button2"

        android:id="@+id/ShenGao"/>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/jisuan"
        android:textSize="30sp"
        android:layout_marginTop="81dp"
        android:id="@+id/JiSuan"
        android:layout_below="@+id/ShenGao"
        android:layout_centerHorizontal="true" />

    <TextView
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:hint=""
        android:id="@+id/show"
        android:textSize="30sp"
        android:layout_below="@+id/JiSuan"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true"
        />



</RelativeLayout>