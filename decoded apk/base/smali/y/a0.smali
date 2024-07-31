.class public final synthetic Ly/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly/e0;

.field public final synthetic b:Ly/e0$b;


# direct methods
.method public synthetic constructor <init>(Ly/e0;Ly/e0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/a0;->a:Ly/e0;

    iput-object p2, p0, Ly/a0;->b:Ly/e0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly/a0;->a:Ly/e0;

    iget-object v1, p0, Ly/a0;->b:Ly/e0$b;

    invoke-static {v0, v1}, Ly/e0;->a(Ly/e0;Ly/e0$b;)V

    return-void
.end method
