.class Le2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Le2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/webkit/internal/t0;

    invoke-direct {v0}, Landroidx/webkit/internal/t0;-><init>()V

    sput-object v0, Le2/e$a;->a:Le2/e;

    return-void
.end method
