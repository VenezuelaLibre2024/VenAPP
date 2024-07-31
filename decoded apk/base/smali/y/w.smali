.class public final synthetic Ly/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/g1$a;


# instance fields
.field public final synthetic a:Ly/x;

.field public final synthetic b:Landroidx/camera/core/impl/g1$a;


# direct methods
.method public synthetic constructor <init>(Ly/x;Landroidx/camera/core/impl/g1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/w;->a:Ly/x;

    iput-object p2, p0, Ly/w;->b:Landroidx/camera/core/impl/g1$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/impl/g1;)V
    .locals 2

    iget-object v0, p0, Ly/w;->a:Ly/x;

    iget-object v1, p0, Ly/w;->b:Landroidx/camera/core/impl/g1$a;

    invoke-static {v0, v1, p1}, Ly/x;->a(Ly/x;Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V

    return-void
.end method
