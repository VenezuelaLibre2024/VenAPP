.class public Lmc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/b;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final a:Lmc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmc/b;

    invoke-direct {v0}, Lmc/b;-><init>()V

    sput-object v0, Lmc/b;->a:Lmc/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lmc/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lmc/b;->a:Lmc/b;

    return-object v0
.end method


# virtual methods
.method public a(Lzb/g;)Lec/a;
    .locals 1

    const-class v0, Lnc/g;

    invoke-virtual {p1, v0}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec/a;

    return-object p1
.end method
