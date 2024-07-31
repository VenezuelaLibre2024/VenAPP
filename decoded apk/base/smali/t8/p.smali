.class public final synthetic Lt8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Lt8/r;


# direct methods
.method public synthetic constructor <init>(Lt8/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/p;->a:Lt8/r;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lt8/p;->a:Lt8/r;

    invoke-static {v0, p1}, Lt8/r;->b(Lt8/r;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
