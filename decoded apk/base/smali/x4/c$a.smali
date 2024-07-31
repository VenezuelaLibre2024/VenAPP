.class public final Lx4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lx4/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx4/c$a;

    invoke-direct {v0}, Lx4/c$a;-><init>()V

    sput-object v0, Lx4/c$a;->a:Lx4/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Lx4/c;
    .locals 2

    new-instance v0, Lx4/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lx4/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/g;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Throwable;Lx4/c$c;)Lx4/c;
    .locals 2

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx4/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lx4/c;-><init>(Ljava/lang/Throwable;Lx4/c$c;Lkotlin/jvm/internal/g;)V

    return-object v0
.end method

.method public static final c(Lorg/json/JSONArray;)Lx4/c;
    .locals 2

    const-string v0, "features"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx4/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx4/c;-><init>(Lorg/json/JSONArray;Lkotlin/jvm/internal/g;)V

    return-object v0
.end method

.method public static final d(Ljava/io/File;)Lx4/c;
    .locals 2

    const-string v0, "file"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx4/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx4/c;-><init>(Ljava/io/File;Lkotlin/jvm/internal/g;)V

    return-object v0
.end method
