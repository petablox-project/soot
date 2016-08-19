/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALabelStatement extends PStatement
{
    private PLabelName _labelName_;
    private TColon _colon_;

    public ALabelStatement()
    {
        // Constructor
    }

    public ALabelStatement(
        @SuppressWarnings("hiding") PLabelName _labelName_,
        @SuppressWarnings("hiding") TColon _colon_)
    {
        // Constructor
        setLabelName(_labelName_);

        setColon(_colon_);

    }

    @Override
    public Object clone()
    {
        return new ALabelStatement(
            cloneNode(this._labelName_),
            cloneNode(this._colon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALabelStatement(this);
    }

    public PLabelName getLabelName()
    {
        return this._labelName_;
    }

    public void setLabelName(PLabelName node)
    {
        if(this._labelName_ != null)
        {
            this._labelName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._labelName_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._labelName_)
            + toString(this._colon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._labelName_ == child)
        {
            this._labelName_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._labelName_ == oldChild)
        {
            setLabelName((PLabelName) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
