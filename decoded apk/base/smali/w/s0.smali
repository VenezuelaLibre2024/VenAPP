.class public final synthetic Lw/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/s$c;

.field public final synthetic b:Lw/i1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/s$c;Lw/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/s0;->a:Landroidx/camera/core/s$c;

    iput-object p2, p0, Lw/s0;->b:Lw/i1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/s0;->a:Landroidx/camera/core/s$c;

    iget-object v1, p0, Lw/s0;->b:Lw/i1;

    invoke-static {v0, v1}, Landroidx/camera/core/s;->W(Landroidx/camera/core/s$c;Lw/i1;)V

    return-void
.end method
