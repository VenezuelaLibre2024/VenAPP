.class public final Lj8/a;
.super Lg8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/a$a;
    }
.end annotation


# instance fields
.field private final o:Lt8/e0;

.field private final p:Lt8/e0;

.field private final q:Lj8/a$a;

.field private r:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "PgsDecoder"

    invoke-direct {p0, v0}, Lg8/h;-><init>(Ljava/lang/String;)V

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    iput-object v0, p0, Lj8/a;->o:Lt8/e0;

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    iput-object v0, p0, Lj8/a;->p:Lt8/e0;

    new-instance v0, Lj8/a$a;

    invoke-direct {v0}, Lj8/a$a;-><init>()V

    iput-object v0, p0, Lj8/a;->q:Lj8/a$a;

    return-void
.end method

.method private B(Lt8/e0;)V
    .locals 2

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lt8/e0;->j()I

    move-result v0

    const/16 v1, 0x78

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lj8/a;->r:Ljava/util/zip/Inflater;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    iput-object v0, p0, Lj8/a;->r:Ljava/util/zip/Inflater;

    :cond_0
    iget-object v0, p0, Lj8/a;->p:Lt8/e0;

    iget-object v1, p0, Lj8/a;->r:Ljava/util/zip/Inflater;

    invoke-static {p1, v0, v1}, Lt8/r0;->q0(Lt8/e0;Lt8/e0;Ljava/util/zip/Inflater;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj8/a;->p:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    iget-object v1, p0, Lj8/a;->p:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->g()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lt8/e0;->S([BI)V

    :cond_1
    return-void
.end method

.method private static C(Lt8/e0;Lj8/a$a;)Lg8/b;
    .locals 5

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v0

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v1

    invoke-virtual {p0}, Lt8/e0;->N()I

    move-result v2

    invoke-virtual {p0}, Lt8/e0;->f()I

    move-result v3

    add-int/2addr v3, v2

    const/4 v4, 0x0

    if-le v3, v0, :cond_0

    invoke-virtual {p0, v0}, Lt8/e0;->U(I)V

    return-object v4

    :cond_0
    const/16 v0, 0x80

    if-eq v1, v0, :cond_1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p1, p0, v2}, Lj8/a$a;->c(Lj8/a$a;Lt8/e0;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1, p0, v2}, Lj8/a$a;->b(Lj8/a$a;Lt8/e0;I)V

    goto :goto_0

    :pswitch_2
    invoke-static {p1, p0, v2}, Lj8/a$a;->a(Lj8/a$a;Lt8/e0;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj8/a$a;->d()Lg8/b;

    move-result-object v4

    invoke-virtual {p1}, Lj8/a$a;->h()V

    :goto_0
    invoke-virtual {p0, v3}, Lt8/e0;->U(I)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected z([BIZ)Lg8/i;
    .locals 0

    iget-object p3, p0, Lj8/a;->o:Lt8/e0;

    invoke-virtual {p3, p1, p2}, Lt8/e0;->S([BI)V

    iget-object p1, p0, Lj8/a;->o:Lt8/e0;

    invoke-direct {p0, p1}, Lj8/a;->B(Lt8/e0;)V

    iget-object p1, p0, Lj8/a;->q:Lj8/a$a;

    invoke-virtual {p1}, Lj8/a$a;->h()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-object p2, p0, Lj8/a;->o:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->a()I

    move-result p2

    const/4 p3, 0x3

    if-lt p2, p3, :cond_1

    iget-object p2, p0, Lj8/a;->o:Lt8/e0;

    iget-object p3, p0, Lj8/a;->q:Lj8/a$a;

    invoke-static {p2, p3}, Lj8/a;->C(Lt8/e0;Lj8/a$a;)Lg8/b;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Lj8/b;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, p1}, Lj8/b;-><init>(Ljava/util/List;)V

    return-object p2
.end method
