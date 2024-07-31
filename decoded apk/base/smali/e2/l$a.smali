.class Le2/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Le2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/webkit/internal/a1;

    invoke-direct {v0}, Landroidx/webkit/internal/a1;-><init>()V

    sput-object v0, Le2/l$a;->a:Le2/l;

    return-void
.end method
