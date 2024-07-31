.class public final synthetic Ly/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly/f0;

.field public final synthetic b:Lw/g0;


# direct methods
.method public synthetic constructor <init>(Ly/f0;Lw/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/d0;->a:Ly/f0;

    iput-object p2, p0, Ly/d0;->b:Lw/g0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly/d0;->a:Ly/f0;

    iget-object v1, p0, Ly/d0;->b:Lw/g0;

    invoke-static {v0, v1}, Ly/e0;->e(Ly/f0;Lw/g0;)V

    return-void
.end method
