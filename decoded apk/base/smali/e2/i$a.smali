.class Le2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Le2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/webkit/internal/x0;

    invoke-direct {v0}, Landroidx/webkit/internal/x0;-><init>()V

    sput-object v0, Le2/i$a;->a:Le2/i;

    return-void
.end method
