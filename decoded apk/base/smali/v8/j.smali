.class public final synthetic Lv8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv8/l;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;


# direct methods
.method public synthetic constructor <init>(Lv8/l;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/j;->a:Lv8/l;

    iput-object p2, p0, Lv8/j;->b:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv8/j;->a:Lv8/l;

    iget-object v1, p0, Lv8/j;->b:Landroid/graphics/SurfaceTexture;

    invoke-static {v0, v1}, Lv8/l;->a(Lv8/l;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
