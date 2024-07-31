.class Lb2/p$b;
.super Lb2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lb2/p;


# direct methods
.method constructor <init>(Lb2/p;)V
    .locals 0

    invoke-direct {p0}, Lb2/m;-><init>()V

    iput-object p1, p0, Lb2/p$b;->a:Lb2/p;

    return-void
.end method


# virtual methods
.method public c(Lb2/l;)V
    .locals 1

    iget-object p1, p0, Lb2/p$b;->a:Lb2/p;

    iget-boolean v0, p1, Lb2/p;->W:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lb2/l;->g0()V

    iget-object p1, p0, Lb2/p$b;->a:Lb2/p;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lb2/p;->W:Z

    :cond_0
    return-void
.end method

.method public e(Lb2/l;)V
    .locals 2

    iget-object v0, p0, Lb2/p$b;->a:Lb2/p;

    iget v1, v0, Lb2/p;->V:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lb2/p;->V:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb2/p;->W:Z

    invoke-virtual {v0}, Lb2/l;->r()V

    :cond_0
    invoke-virtual {p1, p0}, Lb2/l;->T(Lb2/l$f;)Lb2/l;

    return-void
.end method
