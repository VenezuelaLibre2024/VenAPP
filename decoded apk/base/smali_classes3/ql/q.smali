.class public interface abstract Lql/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/q$a;
    }
.end annotation


# static fields
.field public static final a:Lql/q$a;

.field public static final b:Lql/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lql/q$a;->a:Lql/q$a;

    sput-object v0, Lql/q;->a:Lql/q$a;

    new-instance v0, Lql/q$a$a;

    invoke-direct {v0}, Lql/q$a$a;-><init>()V

    sput-object v0, Lql/q;->b:Lql/q;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end method
