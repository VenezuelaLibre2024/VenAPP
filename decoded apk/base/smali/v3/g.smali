.class public Lv3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv3/e<",
        "TZ;TZ;>;"
    }
.end annotation


# static fields
.field private static final a:Lv3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/g<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv3/g;

    invoke-direct {v0}, Lv3/g;-><init>()V

    sput-object v0, Lv3/g;->a:Lv3/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lv3/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "Lv3/e<",
            "TZ;TZ;>;"
        }
    .end annotation

    sget-object v0, Lv3/g;->a:Lv3/g;

    return-object v0
.end method


# virtual methods
.method public a(Lj3/v;Lh3/h;)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TZ;>;",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "TZ;>;"
        }
    .end annotation

    return-object p1
.end method
