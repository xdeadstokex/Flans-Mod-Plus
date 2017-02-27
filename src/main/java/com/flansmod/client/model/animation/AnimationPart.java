package com.flansmod.client.model.animation;

import java.util.ArrayList;

import com.flansmod.common.vector.Vector3f;

public class AnimationPart 
{
	public int type;
	public Vector3f position;
	public Vector3f offset;
	public Vector3f rotation;
	public Vector3f prevPos;
	public Vector3f prevOff;
	public Vector3f prevRot;
	public int parent = -1;
	public boolean hasChildren = false;
	public ArrayList<AnimationPart> children = new ArrayList<AnimationPart>();	
	
	public AnimationPart(int t,Vector3f pos, Vector3f off, Vector3f rot)
	{
		this.type = t;
		this.position = pos;
		this.offset = off;
		this.rotation = rot;
	}
}
