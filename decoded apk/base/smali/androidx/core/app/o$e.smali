.class public Landroidx/core/app/o$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/o$e$a;
    }
.end annotation


# instance fields
.field A:Z

.field B:Z

.field C:Ljava/lang/String;

.field D:Landroid/os/Bundle;

.field E:I

.field F:I

.field G:Landroid/app/Notification;

.field H:Landroid/widget/RemoteViews;

.field I:Landroid/widget/RemoteViews;

.field J:Landroid/widget/RemoteViews;

.field K:Ljava/lang/String;

.field L:I

.field M:Ljava/lang/String;

.field N:J

.field O:I

.field P:I

.field Q:Z

.field R:Landroid/app/Notification;

.field S:Z

.field T:Ljava/lang/Object;

.field public U:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/o$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/s1;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/o$a;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;

.field g:Landroid/app/PendingIntent;

.field h:Landroid/app/PendingIntent;

.field i:Landroid/widget/RemoteViews;

.field j:Landroid/graphics/Bitmap;

.field k:Ljava/lang/CharSequence;

.field l:I

.field m:I

.field n:Z

.field o:Z

.field p:Landroidx/core/app/o$j;

.field q:Ljava/lang/CharSequence;

.field r:Ljava/lang/CharSequence;

.field s:[Ljava/lang/CharSequence;

.field t:I

.field u:I

.field v:Z

.field w:Ljava/lang/String;

.field x:Z

.field y:Ljava/lang/String;

.field z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/core/app/o$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/o$e;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/o$e;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/o$e;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/app/o$e;->n:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/core/app/o$e;->z:Z

    iput v1, p0, Landroidx/core/app/o$e;->E:I

    iput v1, p0, Landroidx/core/app/o$e;->F:I

    iput v1, p0, Landroidx/core/app/o$e;->L:I

    iput v1, p0, Landroidx/core/app/o$e;->O:I

    iput v1, p0, Landroidx/core/app/o$e;->P:I

    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput-object p1, p0, Landroidx/core/app/o$e;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/core/app/o$e;->K:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    iget-object p1, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    iput v1, p0, Landroidx/core/app/o$e;->m:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/core/app/o$e;->U:Ljava/util/ArrayList;

    iput-boolean v0, p0, Landroidx/core/app/o$e;->Q:Z

    return-void
.end method

.method protected static e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/core/app/o$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lq0/c;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lq0/c;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_1

    return-object p1

    :cond_1
    int-to-double v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method private q(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    :goto_0
    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method


# virtual methods
.method public A(Z)Landroidx/core/app/o$e;
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0, p1}, Landroidx/core/app/o$e;->q(IZ)V

    return-object p0
.end method

.method public B(I)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->m:I

    return-object p0
.end method

.method public C(IIZ)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->t:I

    iput p2, p0, Landroidx/core/app/o$e;->u:I

    iput-boolean p3, p0, Landroidx/core/app/o$e;->v:Z

    return-object p0
.end method

.method public D(Ljava/lang/String;)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->M:Ljava/lang/String;

    return-object p0
.end method

.method public E(Z)Landroidx/core/app/o$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/o$e;->n:Z

    return-object p0
.end method

.method public F(I)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public G(Landroid/net/Uri;)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    const/4 p1, -0x1

    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    invoke-static {}, Landroidx/core/app/o$e$a;->b()Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p1, v0}, Landroidx/core/app/o$e$a;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x5

    invoke-static {p1, v0}, Landroidx/core/app/o$e$a;->e(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    invoke-static {p1}, Landroidx/core/app/o$e$a;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    return-object p0
.end method

.method public H(Landroidx/core/app/o$j;)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->p:Landroidx/core/app/o$j;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/o$e;->p:Landroidx/core/app/o$j;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/core/app/o$j;->m(Landroidx/core/app/o$e;)V

    :cond_0
    return-object p0
.end method

.method public I(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/o$e;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/o$e;->q:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public J(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    invoke-static {p1}, Landroidx/core/app/o$e;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public K(J)Landroidx/core/app/o$e;
    .locals 0

    iput-wide p1, p0, Landroidx/core/app/o$e;->N:J

    return-object p0
.end method

.method public L(Z)Landroidx/core/app/o$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/o$e;->o:Z

    return-object p0
.end method

.method public M([J)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    return-object p0
.end method

.method public N(I)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->F:I

    return-object p0
.end method

.method public O(J)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/o$e;
    .locals 2

    iget-object v0, p0, Landroidx/core/app/o$e;->b:Ljava/util/ArrayList;

    new-instance v1, Landroidx/core/app/o$a;

    invoke-direct {v1, p1, p2, p3}, Landroidx/core/app/o$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Landroidx/core/app/o$a;)Landroidx/core/app/o$e;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/app/o$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c()Landroid/app/Notification;
    .locals 1

    new-instance v0, Landroidx/core/app/f0;

    invoke-direct {v0, p0}, Landroidx/core/app/f0;-><init>(Landroidx/core/app/o$e;)V

    invoke-virtual {v0}, Landroidx/core/app/f0;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroidx/core/app/o$e;->D:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Landroidx/core/app/o$e;->D:Landroid/os/Bundle;

    return-object v0
.end method

.method public g(Z)Landroidx/core/app/o$e;
    .locals 1

    const/16 v0, 0x10

    invoke-direct {p0, v0, p1}, Landroidx/core/app/o$e;->q(IZ)V

    return-object p0
.end method

.method public h(Ljava/lang/String;)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->C:Ljava/lang/String;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->K:Ljava/lang/String;

    return-object p0
.end method

.method public j(I)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->E:I

    return-object p0
.end method

.method public k(Z)Landroidx/core/app/o$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/o$e;->A:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/o$e;->B:Z

    return-object p0
.end method

.method public l(Landroid/app/PendingIntent;)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public m(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/o$e;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/o$e;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public n(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/o$e;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/o$e;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public o(I)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    iget p1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    return-object p0
.end method

.method public p(Landroid/app/PendingIntent;)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public r(Landroid/app/PendingIntent;Z)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->h:Landroid/app/PendingIntent;

    const/16 p1, 0x80

    invoke-direct {p0, p1, p2}, Landroidx/core/app/o$e;->q(IZ)V

    return-object p0
.end method

.method public s(Ljava/lang/String;)Landroidx/core/app/o$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/o$e;->w:Ljava/lang/String;

    return-object p0
.end method

.method public t(I)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->O:I

    return-object p0
.end method

.method public u(Z)Landroidx/core/app/o$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/o$e;->x:Z

    return-object p0
.end method

.method public v(Landroid/graphics/Bitmap;)Landroidx/core/app/o$e;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/app/o$e;->f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/o$e;->j:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public w(III)Landroidx/core/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/o$e;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 p2, p2, -0x2

    or-int/2addr p1, p2

    iput p1, v0, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public x(Z)Landroidx/core/app/o$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/o$e;->z:Z

    return-object p0
.end method

.method public y(I)Landroidx/core/app/o$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/o$e;->l:I

    return-object p0
.end method

.method public z(Z)Landroidx/core/app/o$e;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Landroidx/core/app/o$e;->q(IZ)V

    return-object p0
.end method
