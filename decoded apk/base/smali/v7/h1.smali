.class public abstract Lv7/h1;
.super Lv7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv7/g<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final w:Ljava/lang/Void;


# instance fields
.field protected final v:Lv7/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Lv7/a0;)V
    .locals 0

    invoke-direct {p0}, Lv7/g;-><init>()V

    iput-object p1, p0, Lv7/h1;->v:Lv7/a0;

    return-void
.end method


# virtual methods
.method protected final C(Ls8/m0;)V
    .locals 0

    invoke-super {p0, p1}, Lv7/g;->C(Ls8/m0;)V

    invoke-virtual {p0}, Lv7/h1;->V()V

    return-void
.end method

.method protected bridge synthetic G(Ljava/lang/Object;Lv7/a0$b;)Lv7/a0$b;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lv7/h1;->M(Ljava/lang/Void;Lv7/a0$b;)Lv7/a0$b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic H(Ljava/lang/Object;J)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lv7/h1;->P(Ljava/lang/Void;J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected bridge synthetic I(Ljava/lang/Object;I)I
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lv7/h1;->R(Ljava/lang/Void;I)I

    move-result p1

    return p1
.end method

.method protected bridge synthetic K(Ljava/lang/Object;Lv7/a0;Lt6/d4;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lv7/h1;->S(Ljava/lang/Void;Lv7/a0;Lt6/d4;)V

    return-void
.end method

.method protected final M(Ljava/lang/Void;Lv7/a0$b;)Lv7/a0$b;
    .locals 0

    invoke-virtual {p0, p2}, Lv7/h1;->N(Lv7/a0$b;)Lv7/a0$b;

    move-result-object p1

    return-object p1
.end method

.method protected N(Lv7/a0$b;)Lv7/a0$b;
    .locals 0

    return-object p1
.end method

.method protected O(J)J
    .locals 0

    return-wide p1
.end method

.method protected final P(Ljava/lang/Void;J)J
    .locals 0

    invoke-virtual {p0, p2, p3}, Lv7/h1;->O(J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected Q(I)I
    .locals 0

    return p1
.end method

.method protected final R(Ljava/lang/Void;I)I
    .locals 0

    invoke-virtual {p0, p2}, Lv7/h1;->Q(I)I

    move-result p1

    return p1
.end method

.method protected final S(Ljava/lang/Void;Lv7/a0;Lt6/d4;)V
    .locals 0

    invoke-virtual {p0, p3}, Lv7/h1;->T(Lt6/d4;)V

    return-void
.end method

.method protected abstract T(Lt6/d4;)V
.end method

.method protected final U()V
    .locals 2

    sget-object v0, Lv7/h1;->w:Ljava/lang/Void;

    iget-object v1, p0, Lv7/h1;->v:Lv7/a0;

    invoke-virtual {p0, v0, v1}, Lv7/g;->L(Ljava/lang/Object;Lv7/a0;)V

    return-void
.end method

.method protected V()V
    .locals 0

    invoke-virtual {p0}, Lv7/h1;->U()V

    return-void
.end method

.method public d()Lt6/c2;
    .locals 1

    iget-object v0, p0, Lv7/h1;->v:Lv7/a0;

    invoke-interface {v0}, Lv7/a0;->d()Lt6/c2;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lv7/h1;->v:Lv7/a0;

    invoke-interface {v0}, Lv7/a0;->o()Z

    move-result v0

    return v0
.end method

.method public p()Lt6/d4;
    .locals 1

    iget-object v0, p0, Lv7/h1;->v:Lv7/a0;

    invoke-interface {v0}, Lv7/a0;->p()Lt6/d4;

    move-result-object v0

    return-object v0
.end method
