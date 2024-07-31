.class Ljh/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljh/a;


# direct methods
.method constructor <init>(Ljh/a;)V
    .locals 0

    iput-object p1, p0, Ljh/a$b;->a:Ljh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljh/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljh/a$b;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 2

    iget-object v0, p0, Ljh/a$b;->a:Ljh/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljh/a;->d(Ljh/a;Z)Z

    iget-object v0, p0, Ljh/a$b;->a:Ljh/a;

    invoke-static {v0}, Ljh/a;->e(Ljh/a;)V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    iget-object p1, p0, Ljh/a$b;->a:Ljh/a;

    invoke-static {p1}, Ljh/a;->c(Ljh/a;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Ljh/b;

    invoke-direct {p2, p0}, Ljh/b;-><init>(Ljh/a$b;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
