.class public final Lq9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lca/d;

.field public static final b:[Lca/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lca/d;

    const-string v1, "app_set_id"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lq9/h;->a:Lca/d;

    const/4 v1, 0x1

    new-array v1, v1, [Lca/d;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lq9/h;->b:[Lca/d;

    return-void
.end method
