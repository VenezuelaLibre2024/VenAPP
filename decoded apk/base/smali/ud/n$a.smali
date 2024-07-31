.class Lud/n$a;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/n;->b(Lud/n$b;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lud/n$b;

.field final synthetic b:Lud/n;


# direct methods
.method constructor <init>(Lud/n;JJLud/n$b;)V
    .locals 0

    iput-object p1, p0, Lud/n$a;->b:Lud/n;

    iput-object p6, p0, Lud/n$a;->a:Lud/n$b;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    iget-object v0, p0, Lud/n$a;->a:Lud/n$b;

    invoke-interface {v0}, Lud/n$b;->a()V

    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
