package com.example.admin.worldhistoryp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter4 extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter4(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.numasia1,
            R.drawable.numasia2,
            R.drawable.numasia3,
            R.drawable.numasia4,
            R.drawable.numasia5
    };
    public String[] slide_heading = {
            " ",
            " ",
            " ",
            " ",
            " "
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout2, container, false);

        ImageView slieImageview = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);

        slieImageview.setImageResource(slide_images[position]);


        slieImageview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (position == 0) {

                    Intent it = new Intent(context.getApplicationContext(), asia1.class);
                    context.startActivity(it);
                }
                if (position == 1) {

                    Intent it = new Intent(context.getApplicationContext(), asia2.class);
                    context.startActivity(it);
                }
                if (position == 2) {

                    Intent it = new Intent(context.getApplicationContext(), asia3.class);
                    context.startActivity(it);
                }
                if (position == 3) {

                    Intent it = new Intent(context.getApplicationContext(), asia4.class);
                    context.startActivity(it);
                }
                if (position == 4) {

                    Intent it = new Intent(context.getApplicationContext(), asia5.class);
                    context.startActivity(it);
                }
            }

        });

        slideHeading.setText(slide_heading[position]);

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
