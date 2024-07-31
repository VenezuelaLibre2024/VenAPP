.class public final Lc6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc6/a;

    invoke-direct {v0}, Lc6/a;-><init>()V

    sput-object v0, Lc6/a;->a:Lc6/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Ljava/lang/String;
    .locals 1

    const-string v0, "6.17.0.0"

    return-object v0
.end method
