.class public interface abstract Ly6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly6/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly6/o;

    invoke-direct {v0}, Ly6/o;-><init>()V

    sput-object v0, Ly6/p;->a:Ly6/p;

    return-void
.end method

.method private static synthetic a()[Ly6/k;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ly6/k;

    return-object v0
.end method

.method public static synthetic d()[Ly6/k;
    .locals 1

    invoke-static {}, Ly6/p;->a()[Ly6/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Landroid/net/Uri;Ljava/util/Map;)[Ly6/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Ly6/k;"
        }
    .end annotation

    invoke-interface {p0}, Ly6/p;->c()[Ly6/k;

    move-result-object p1

    return-object p1
.end method

.method public abstract c()[Ly6/k;
.end method
