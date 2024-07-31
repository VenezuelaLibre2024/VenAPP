.class Landroidx/webkit/internal/k1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/internal/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Landroidx/webkit/internal/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/webkit/internal/r1;

    invoke-static {}, Landroidx/webkit/internal/k1;->d()Landroidx/webkit/internal/m1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/webkit/internal/m1;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/webkit/internal/r1;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Landroidx/webkit/internal/k1$a;->a:Landroidx/webkit/internal/r1;

    return-void
.end method
