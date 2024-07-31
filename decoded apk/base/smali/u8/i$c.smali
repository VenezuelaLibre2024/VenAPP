.class final Lu8/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/l$c;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field final synthetic b:Lu8/i;


# direct methods
.method public constructor <init>(Lu8/i;Lk7/l;)V
    .locals 0

    iput-object p1, p0, Lu8/i$c;->b:Lu8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lt8/r0;->x(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lu8/i$c;->a:Landroid/os/Handler;

    invoke-interface {p2, p0, p1}, Lk7/l;->h(Lk7/l$c;Landroid/os/Handler;)V

    return-void
.end method

.method private b(J)V
    .locals 2

    iget-object v0, p0, Lu8/i$c;->b:Lu8/i;

    iget-object v1, v0, Lu8/i;->w1:Lu8/i$c;

    if-ne p0, v1, :cond_2

    invoke-static {v0}, Lu8/i;->y1(Lu8/i;)Lk7/l;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lu8/i$c;->b:Lu8/i;

    invoke-static {p1}, Lu8/i;->z1(Lu8/i;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lu8/i$c;->b:Lu8/i;

    invoke-virtual {v0, p1, p2}, Lu8/i;->Z1(J)V
    :try_end_0
    .catch Lt6/x; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lu8/i$c;->b:Lu8/i;

    invoke-static {p2, p1}, Lu8/i;->A1(Lu8/i;Lt6/x;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lk7/l;JJ)V
    .locals 0

    sget p1, Lt8/r0;->a:I

    const/16 p4, 0x1e

    if-ge p1, p4, :cond_0

    iget-object p1, p0, Lu8/i$c;->a:Landroid/os/Handler;

    const/16 p4, 0x20

    shr-long p4, p2, p4

    long-to-int p4, p4

    long-to-int p2, p2

    const/4 p3, 0x0

    invoke-static {p1, p3, p4, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lu8/i$c;->a:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Lu8/i$c;->b(J)V

    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, p1}, Lt8/r0;->X0(II)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu8/i$c;->b(J)V

    const/4 p1, 0x1

    return p1
.end method
