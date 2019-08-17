package vn.edu.poly.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SinhvienAdapter extends BaseAdapter {


    private List<Sinhvien> sinhvienList;
    private Context context;

    public SinhvienAdapter(Context context,List<Sinhvien> sinhvienList) {
        this.sinhvienList = sinhvienList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return sinhvienList.size();
    }

    @Override
    public Sinhvien getItem(int i) {
        return sinhvienList.get(i);
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }


    private class ViewHolder{
        TextView tvID,tvName,tvClass;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder=null;
        Sinhvien sinhvien = (Sinhvien) getItem(i);
        if(view ==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.row,viewGroup,false);
            viewHolder.tvID=view.findViewById(R.id.tvID);
            viewHolder.tvName=view.findViewById(R.id.tvName);
            viewHolder.tvClass=view.findViewById(R.id.tvClass);
            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvID.setText(sinhvien.getId());
        viewHolder.tvName.setText(sinhvien.getTen());
        viewHolder.tvClass.setText(sinhvien.getLop());


        view.findViewById(R.id.btnX).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinhvienList.remove(i);
                notifyDataSetChanged();
            }
        });

        return view;
    }
}
