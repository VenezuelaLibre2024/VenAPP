.class Lih/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lih/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lih/i;


# direct methods
.method constructor <init>(Lih/i;)V
    .locals 0

    iput-object p1, p0, Lih/i$a;->a:Lih/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lig/k;->e:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lih/i$a;->a:Lih/i;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lih/q;

    invoke-static {v0, p1}, Lih/i;->a(Lih/i;Lih/q;)V

    goto :goto_0

    :cond_0
    sget p1, Lig/k;->i:I

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lih/i$a;->a:Lih/i;

    invoke-static {p1}, Lih/i;->b(Lih/i;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
