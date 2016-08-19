/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AUnnamedMethodSignature extends PUnnamedMethodSignature
{
    private TCmplt _cmplt_;
    private PType _type_;
    private TLParen _lParen_;
    private PParameterList _parameterList_;
    private TRParen _rParen_;
    private TCmpgt _cmpgt_;

    public AUnnamedMethodSignature()
    {
        // Constructor
    }

    public AUnnamedMethodSignature(
        @SuppressWarnings("hiding") TCmplt _cmplt_,
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PParameterList _parameterList_,
        @SuppressWarnings("hiding") TRParen _rParen_,
        @SuppressWarnings("hiding") TCmpgt _cmpgt_)
    {
        // Constructor
        setCmplt(_cmplt_);

        setType(_type_);

        setLParen(_lParen_);

        setParameterList(_parameterList_);

        setRParen(_rParen_);

        setCmpgt(_cmpgt_);

    }

    @Override
    public Object clone()
    {
        return new AUnnamedMethodSignature(
            cloneNode(this._cmplt_),
            cloneNode(this._type_),
            cloneNode(this._lParen_),
            cloneNode(this._parameterList_),
            cloneNode(this._rParen_),
            cloneNode(this._cmpgt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnnamedMethodSignature(this);
    }

    public TCmplt getCmplt()
    {
        return this._cmplt_;
    }

    public void setCmplt(TCmplt node)
    {
        if(this._cmplt_ != null)
        {
            this._cmplt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmplt_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PParameterList getParameterList()
    {
        return this._parameterList_;
    }

    public void setParameterList(PParameterList node)
    {
        if(this._parameterList_ != null)
        {
            this._parameterList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterList_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    public TCmpgt getCmpgt()
    {
        return this._cmpgt_;
    }

    public void setCmpgt(TCmpgt node)
    {
        if(this._cmpgt_ != null)
        {
            this._cmpgt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpgt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmplt_)
            + toString(this._type_)
            + toString(this._lParen_)
            + toString(this._parameterList_)
            + toString(this._rParen_)
            + toString(this._cmpgt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmplt_ == child)
        {
            this._cmplt_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._parameterList_ == child)
        {
            this._parameterList_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        if(this._cmpgt_ == child)
        {
            this._cmpgt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmplt_ == oldChild)
        {
            setCmplt((TCmplt) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._parameterList_ == oldChild)
        {
            setParameterList((PParameterList) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        if(this._cmpgt_ == oldChild)
        {
            setCmpgt((TCmpgt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
