.class public interface abstract La8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/d;

    invoke-direct {v0}, La8/d;-><init>()V

    sput-object v0, La8/h;->a:La8/h;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Lt6/u1;Ljava/util/List;Lt8/n0;Ljava/util/Map;Ly6/l;Lu6/m3;)La8/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lt6/u1;",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;",
            "Lt8/n0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ly6/l;",
            "Lu6/m3;",
            ")",
            "La8/j;"
        }
    .end annotation
.end method
