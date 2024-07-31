.class public final Ljb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljb/k;

.field public static final c:Ljb/k;

.field public static final d:Ljb/k;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljb/k;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Ljb/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Ljb/k;->b:Ljb/k;

    new-instance v0, Ljb/k;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Ljb/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Ljb/k;->c:Ljb/k;

    new-instance v0, Ljb/k;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Ljb/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Ljb/k;->d:Ljb/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljb/k;->a:Ljava/lang/String;

    return-object v0
.end method
