.class final Lte/b;
.super Lte/e;
.source "SourceFile"


# instance fields
.field private final a:Lxe/g;


# direct methods
.method constructor <init>(Lxe/g;)V
    .locals 0

    invoke-direct {p0}, Lte/e;-><init>()V

    iput-object p1, p0, Lte/b;->a:Lxe/g;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-object v0, p0, Lte/b;->a:Lxe/g;

    invoke-virtual {v0}, Lxe/g;->p0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lte/b;->a:Lxe/g;

    invoke-virtual {v0}, Lxe/g;->l0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lte/b;->a:Lxe/g;

    invoke-virtual {v0}, Lxe/g;->k0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lte/b;->a:Lxe/g;

    invoke-virtual {v0}, Lxe/g;->o0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lte/b;->a:Lxe/g;

    invoke-virtual {v0}, Lxe/g;->n0()Lxe/f;

    move-result-object v0

    invoke-virtual {v0}, Lxe/f;->g0()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
