.class public Lb2/b;
.super Lb2/p;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb2/p;-><init>()V

    invoke-direct {p0}, Lb2/b;->v0()V

    return-void
.end method

.method private v0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lb2/p;->s0(I)Lb2/p;

    new-instance v1, Lb2/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb2/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lb2/p;->k0(Lb2/l;)Lb2/p;

    move-result-object v1

    new-instance v2, Lb2/c;

    invoke-direct {v2}, Lb2/c;-><init>()V

    invoke-virtual {v1, v2}, Lb2/p;->k0(Lb2/l;)Lb2/p;

    move-result-object v1

    new-instance v2, Lb2/d;

    invoke-direct {v2, v0}, Lb2/d;-><init>(I)V

    invoke-virtual {v1, v2}, Lb2/p;->k0(Lb2/l;)Lb2/p;

    return-void
.end method
