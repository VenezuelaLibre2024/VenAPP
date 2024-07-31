.class public final synthetic Li0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/y1$c;


# instance fields
.field public final synthetic a:Li0/d;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/camera/core/impl/k2;

.field public final synthetic d:Landroidx/camera/core/impl/b2;


# direct methods
.method public synthetic constructor <init>(Li0/d;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/b;->a:Li0/d;

    iput-object p2, p0, Li0/b;->b:Ljava/lang/String;

    iput-object p3, p0, Li0/b;->c:Landroidx/camera/core/impl/k2;

    iput-object p4, p0, Li0/b;->d:Landroidx/camera/core/impl/b2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 6

    iget-object v0, p0, Li0/b;->a:Li0/d;

    iget-object v1, p0, Li0/b;->b:Ljava/lang/String;

    iget-object v2, p0, Li0/b;->c:Landroidx/camera/core/impl/k2;

    iget-object v3, p0, Li0/b;->d:Landroidx/camera/core/impl/b2;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Li0/d;->W(Li0/d;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method
