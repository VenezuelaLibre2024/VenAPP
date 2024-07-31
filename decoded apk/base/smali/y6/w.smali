.class public final Ly6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt8/e0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt8/e0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Ly6/w;->a:Lt8/e0;

    return-void
.end method


# virtual methods
.method public a(Ly6/l;Lq7/h$a;)Ll7/a;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    :try_start_0
    iget-object v3, p0, Ly6/w;->a:Lt8/e0;

    invoke-virtual {v3}, Lt8/e0;->e()[B

    move-result-object v3

    const/16 v4, 0xa

    invoke-interface {p1, v3, v0, v4}, Ly6/l;->q([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Ly6/w;->a:Lt8/e0;

    invoke-virtual {v3, v0}, Lt8/e0;->U(I)V

    iget-object v3, p0, Ly6/w;->a:Lt8/e0;

    invoke-virtual {v3}, Lt8/e0;->K()I

    move-result v3

    const v5, 0x494433

    if-eq v3, v5, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Ly6/w;->a:Lt8/e0;

    const/4 v5, 0x3

    invoke-virtual {v3, v5}, Lt8/e0;->V(I)V

    iget-object v3, p0, Ly6/w;->a:Lt8/e0;

    invoke-virtual {v3}, Lt8/e0;->G()I

    move-result v3

    add-int/lit8 v5, v3, 0xa

    if-nez v1, :cond_1

    new-array v1, v5, [B

    iget-object v6, p0, Ly6/w;->a:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->e()[B

    move-result-object v6

    invoke-static {v6, v0, v1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {p1, v1, v4, v3}, Ly6/l;->q([BII)V

    new-instance v3, Lq7/h;

    invoke-direct {v3, p2}, Lq7/h;-><init>(Lq7/h$a;)V

    invoke-virtual {v3, v1, v5}, Lq7/h;->e([BI)Ll7/a;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v3}, Ly6/l;->k(I)V

    :goto_1
    add-int/2addr v2, v5

    goto :goto_0

    :catch_0
    :goto_2
    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1, v2}, Ly6/l;->k(I)V

    return-object v1
.end method
