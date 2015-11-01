package com.ellekay.lucie.instaflight;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lucie on 10/31/15.
 */
public class SpeakerAdapter extends RecyclerView.Adapter<SpeakerAdapter.SpeakerViewHolder> {

    @Override
    public SpeakerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_speakers,parent,false);
        SpeakerViewHolder myHolder = new SpeakerViewHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(SpeakerViewHolder holder, int position) {

        holder.speakerName.setText(speakers.get(position).name);
        holder.description.setText(speakers.get(position).descr);
        holder.twitterHandle.setText(speakers.get(position).twitter);
        holder.speakerImg.setImageResource(speakers.get(position).imgId);
    }

    @Override
    public int getItemCount() {
        return speakers.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class SpeakerViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView speakerName, description, twitterHandle;
        ImageView speakerImg;

        public SpeakerViewHolder(View itemView) {
            super(itemView);
            card = (CardView) itemView.findViewById(R.id.speakercard);
            speakerImg = (ImageView) itemView.findViewById(R.id.speakerImg);
            speakerName = (TextView) itemView.findViewById(R.id.speakerName);
            description = (TextView) itemView.findViewById(R.id.speakerDescr);
            twitterHandle = (TextView) itemView.findViewById(R.id.speakerTwit);
            }
        }

    List<MySpeaker> speakers;
    SpeakerAdapter(List<MySpeaker> speakers){
        this.speakers = speakers;
    }
    }