.class public final synthetic Ly/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly/r0;

.field public final synthetic b:Ly/i0;


# direct methods
.method public synthetic constructor <init>(Ly/r0;Ly/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/p0;->a:Ly/r0;

    iput-object p2, p0, Ly/p0;->b:Ly/i0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly/p0;->a:Ly/r0;

    iget-object v1, p0, Ly/p0;->b:Ly/i0;

    invoke-static {v0, v1}, Ly/r0;->c(Ly/r0;Ly/i0;)V

    return-void
.end method
