# DynamicNumImageView

A android weight that can custom style
----
##Preview
![](device-2016-12-06-163517_small.png)
##Install
In your `build.gradle` :

```groovy
dependencies {
    compile 'com.chenanze:dynamicnumimageview:1.0.0'
}
```


## Use

In your layout file:

```xm
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center_horizontal"
    android:orientation="vertical"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="navgnss.com.dynamicnumimageview.MainActivity">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_1_dniv"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:thumb="@drawable/ic_launcher"
            app:number_text_content_scale="0.6"
            app:number_view_scale="0.5"
            app:text_content="1" />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_3"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:thumb="@drawable/ic_launcher"
            app:number_text_content_scale="0.6"
            app:number_view_backgroud_color="@android:color/holo_green_light"
            app:number_view_scale="0.4"
            app:text_content="2"

            />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_3_dniv"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:thumb="@drawable/ic_launcher"
            app:number_text_content_scale="0.6"
            app:number_view_backgroud_color="@android:color/holo_blue_light"
            app:number_view_scale="0.3"
            app:text_content="3"

            />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_4_dniv"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:thumb="@drawable/ic_launcher"
            app:number_text_content_scale="0.6"
            app:number_view_backgroud_color="@android:color/holo_orange_light"
            app:number_view_scale="0.2"
            app:text_content="4"

            />
    </LinearLayout>

    <LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <navgnss.com.library.DynamicNumImageView
        android:id="@+id/test_1_div_1"
        android:layout_width="80dp"
        android:layout_height="80dp"
        app:number_text_content_color="@android:color/holo_blue_light"
        app:number_text_content_scale="1"
        app:number_view_backgroud_color="@android:color/white"
        android:thumb="@drawable/ic_launcher"
        app:number_view_scale="0.4"
        app:text_content="1"
        app:vertex_position="top_left" />

    <navgnss.com.library.DynamicNumImageView
        android:id="@+id/test_2_div_1"
        android:layout_width="80dp"
        android:layout_height="80dp"
        app:number_text_content_color="@android:color/holo_green_light"
        app:number_text_content_scale="0.9"
        app:number_view_backgroud_color="@android:color/white"
        android:thumb="@drawable/ic_launcher"
        app:number_view_scale="0.4"
        app:text_content="2"
        app:vertex_position="top_left" />

    <navgnss.com.library.DynamicNumImageView
        android:id="@+id/test_3_div_1"
        android:layout_width="80dp"
        android:layout_height="80dp"
        app:number_text_content_color="@android:color/holo_purple"
        app:number_text_content_scale="0.8"
        app:number_view_backgroud_color="@android:color/white"
        android:thumb="@drawable/ic_launcher"
        app:number_view_scale="0.4"
        app:text_content="3"
        app:vertex_position="top_left" />

    <navgnss.com.library.DynamicNumImageView
        android:id="@+id/test_4_div_1"
        android:layout_width="80dp"
        android:layout_height="80dp"
        app:number_text_content_color="@android:color/holo_blue_light"
        app:number_text_content_scale="0.7"
        app:number_view_backgroud_color="@android:color/white"
        android:thumb="@drawable/ic_launcher"
        app:number_view_scale="0.4"
        app:text_content="4"
        app:vertex_position="top_left" />
</LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_1_div_2"
            android:layout_width="120dp"
            android:layout_height="120dp"
            app:number_text_content_color="@android:color/holo_blue_light"
            app:number_text_content_scale="1"
            app:number_view_backgroud_color="@android:color/white"
            android:thumb="@drawable/ic_launcher"
            app:number_view_scale="0.4"
            app:text_content="1" />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_2_div_2"
            android:layout_width="100dp"
            android:layout_height="100dp"
            app:number_text_content_color="@android:color/white"
            app:number_text_content_scale="0.6"
            app:number_view_backgroud_color="@android:color/holo_red_light"
            android:thumb="@drawable/ic_launcher"
            app:number_view_scale="0.4"
            app:text_content="+99" />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_3_div_2"
            android:layout_width="90dp"
            android:layout_height="90dp"
            app:number_text_content_color="@android:color/holo_green_light"
            app:number_text_content_scale="0.8"
            app:number_view_backgroud_color="@android:color/white"
            android:thumb="@drawable/ic_launcher"
            app:number_view_scale="0.4"
            app:text_content="3"
            app:vertex_position="bottom_left" />

        <navgnss.com.library.DynamicNumImageView
            android:id="@+id/test_4_div_2"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:thumb="@drawable/ic_launcher"
            app:number_text_content_color="@android:color/holo_blue_light"
            app:number_text_content_scale="0.7"
            app:number_view_backgroud_color="@android:color/white"
            app:number_view_scale="0.4"
            app:text_content="4"
            app:vertex_position="bottom_right" />
    </LinearLayout>
</LinearLayout>

```
