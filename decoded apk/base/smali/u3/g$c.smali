.class Lu3/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lu3/g;


# direct methods
.method constructor <init>(Lu3/g;)V
    .locals 0

    iput-object p1, p0, Lu3/g$c;->a:Lu3/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu3/g$a;

    iget-object v0, p0, Lu3/g$c;->a:Lu3/g;

    invoke-virtual {v0, p1}, Lu3/g;->m(Lu3/g$a;)V

    return v1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu3/g$a;

    iget-object v0, p0, Lu3/g$c;->a:Lu3/g;

    iget-object v0, v0, Lu3/g;->d:Lcom/bumptech/glide/k;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/k;->m(Lz3/d;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
