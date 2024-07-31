.class public final synthetic Lv8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field public final synthetic a:Lv8/i;


# direct methods
.method public synthetic constructor <init>(Lv8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/h;->a:Lv8/i;

    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object v0, p0, Lv8/h;->a:Lv8/i;

    invoke-static {v0, p1}, Lv8/i;->d(Lv8/i;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
