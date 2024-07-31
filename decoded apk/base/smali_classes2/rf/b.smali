.class public final synthetic Lrf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lrf/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/b;

    invoke-direct {v0}, Lrf/b;-><init>()V

    sput-object v0, Lrf/b;->a:Lrf/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Lcom/google/mlkit/common/sdkinternal/j;

    invoke-direct {p1}, Lcom/google/mlkit/common/sdkinternal/j;-><init>()V

    return-object p1
.end method
