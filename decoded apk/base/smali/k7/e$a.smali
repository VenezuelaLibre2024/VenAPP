.class Lk7/e$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/e;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk7/e;


# direct methods
.method constructor <init>(Lk7/e;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lk7/e$a;->a:Lk7/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lk7/e$a;->a:Lk7/e;

    invoke-static {v0, p1}, Lk7/e;->a(Lk7/e;Landroid/os/Message;)V

    return-void
.end method
