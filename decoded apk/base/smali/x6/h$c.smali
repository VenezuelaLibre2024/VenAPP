.class Lx6/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/b0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lx6/h;


# direct methods
.method private constructor <init>(Lx6/h;)V
    .locals 0

    iput-object p1, p0, Lx6/h$c;->a:Lx6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx6/h;Lx6/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/h$c;-><init>(Lx6/h;)V

    return-void
.end method


# virtual methods
.method public a(Lx6/b0;[BII[B)V
    .locals 0

    iget-object p1, p0, Lx6/h$c;->a:Lx6/h;

    iget-object p1, p1, Lx6/h;->z:Lx6/h$d;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/h$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
