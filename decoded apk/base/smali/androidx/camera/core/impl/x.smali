.class public Landroidx/camera/core/impl/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/x$a;
    }
.end annotation


# static fields
.field private static final a:Landroidx/camera/core/impl/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/x$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/x$a;-><init>()V

    sput-object v0, Landroidx/camera/core/impl/x;->a:Landroidx/camera/core/impl/u;

    return-void
.end method

.method public static a()Landroidx/camera/core/impl/u;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/x;->a:Landroidx/camera/core/impl/u;

    return-object v0
.end method
