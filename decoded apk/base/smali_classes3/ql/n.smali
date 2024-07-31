.class public interface abstract Lql/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/n$a;
    }
.end annotation


# static fields
.field public static final a:Lql/n$a;

.field public static final b:Lql/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lql/n$a;->a:Lql/n$a;

    sput-object v0, Lql/n;->a:Lql/n$a;

    new-instance v0, Lql/n$a$a;

    invoke-direct {v0}, Lql/n$a$a;-><init>()V

    sput-object v0, Lql/n;->b:Lql/n;

    return-void
.end method


# virtual methods
.method public abstract a(Lql/u;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql/u;",
            ")",
            "Ljava/util/List<",
            "Lql/m;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lql/u;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql/u;",
            "Ljava/util/List<",
            "Lql/m;",
            ">;)V"
        }
    .end annotation
.end method
