.class public interface abstract Lk7/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk7/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk7/s;

    invoke-direct {v0}, Lk7/s;-><init>()V

    sput-object v0, Lk7/t;->a:Lk7/t;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;ZZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lk7/p;",
            ">;"
        }
    .end annotation
.end method
