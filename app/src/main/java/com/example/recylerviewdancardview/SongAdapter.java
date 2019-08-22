package com.example.recylerviewdancardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<Song> songList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvRank, tvSongname, tvSinger, tvyear;
        public ImageView ivAlbumCover;

        public ViewHolder( View v) {
            super(v);
            tvRank = (TextView)v.findViewById(R.id.tv_rank);
            tvSongname = (TextView)v.findViewById(R.id.tv_song_name);
            tvSinger = (TextView)v.findViewById(R.id.tv_singer);
            tvyear = (TextView)v.findViewById(R.id.tv_year);
            ivAlbumCover = (ImageView) v.findViewById(R.id.iv_album_cover);
        }
    }

    public SongAdapter(List<Song>songList){
        this.songList = songList;
    }

    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(SongAdapter.ViewHolder holder, int position) {
        Song song = songList.get(position);

        holder.tvRank.setText(String.valueOf(song.getRank()));
        holder.tvSongname.setText(String.valueOf(song.getName()));
        holder.tvSinger.setText(String.valueOf(song.getSinger()));
        holder.tvyear.setText(String.valueOf(song.getYear()));
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvyear.setText("2016");

    }


    @Override
    public int getItemCount() {
        return songList.size();
    }


}
